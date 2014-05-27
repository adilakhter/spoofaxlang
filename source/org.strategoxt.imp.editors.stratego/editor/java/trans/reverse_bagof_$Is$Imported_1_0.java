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

@SuppressWarnings("all") public class reverse_bagof_$Is$Imported_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Imported_1_0 instance = new reverse_bagof_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4840)
  { 
    context.push("reverse_bagof_IsImported_1_0");
    Fail23447:
    { 
      TermReference w_4840 = new TermReference();
      TermReference x_4840 = new TermReference();
      if(x_4840.value == null)
        x_4840.value = term;
      else
        if(x_4840.value != term && !x_4840.value.match(term))
          break Fail23447;
      if(w_4840.value == null)
        w_4840.value = term;
      else
        if(w_4840.value != term && !w_4840.value.match(term))
          break Fail23447;
      Success12592:
      { 
        Fail23448:
        { 
          IStrategoTerm c_4841 = null;
          c_4841 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4841, trans.const4537, x_4840.value);
          if(term == null)
            break Fail23448;
          if(true)
            break Success12592;
        }
        term = trans.constNil4;
      }
      lifted6991 lifted69910 = new lifted6991();
      lifted69910.w_4840 = w_4840;
      lifted69910.x_4840 = x_4840;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted69910, z_4840);
      if(term == null)
        break Fail23447;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}