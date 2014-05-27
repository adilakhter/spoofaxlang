package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_source_files_2_0 extends Strategy 
{ 
  public static get_source_files_2_0 instance = new get_source_files_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4734, Strategy y_4734)
  { 
    context.push("get_source_files_2_0");
    Fail22817:
    { 
      TermReference a_4734 = new TermReference();
      IStrategoTerm b_4734 = null;
      if(a_4734.value == null)
        a_4734.value = term;
      else
        if(a_4734.value != term && !a_4734.value.match(term))
          break Fail22817;
      Success12162:
      { 
        Fail22818:
        { 
          IStrategoTerm c_4734 = null;
          IStrategoTerm d_4734 = null;
          c_4734 = term;
          if(a_4734.value == null)
            break Fail22818;
          term = a_4734.value;
          d_4734 = a_4734.value;
          term = y_4734.invoke(context, term);
          if(term == null)
            break Fail22818;
          term = isdir_0_0.instance.invoke(context, d_4734);
          if(term == null)
            break Fail22818;
          term = c_4734;
          { 
            if(a_4734.value == null)
              break Fail22817;
            term = readdir_0_0.instance.invoke(context, a_4734.value);
            if(term == null)
              break Fail22817;
            lifted6769 lifted67690 = new lifted6769();
            lifted67690.a_4734 = a_4734;
            term = map_1_0.instance.invoke(context, term, lifted67690);
            if(term == null)
              break Fail22817;
            lifted6770 lifted67700 = new lifted6770();
            lifted67700.x_4734 = x_4734;
            lifted67700.y_4734 = y_4734;
            term = map_1_0.instance.invoke(context, term, lifted67700);
            if(term == null)
              break Fail22817;
            term = flatten_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22817;
            b_4734 = term;
            if(true)
              break Success12162;
          }
        }
        term = trans.constNil4;
        b_4734 = trans.constNil4;
      }
      term = b_4734;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}