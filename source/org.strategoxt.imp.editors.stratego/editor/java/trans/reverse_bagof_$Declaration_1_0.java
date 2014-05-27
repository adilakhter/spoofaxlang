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

@SuppressWarnings("all") public class reverse_bagof_$Declaration_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Declaration_1_0 instance = new reverse_bagof_$Declaration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4867)
  { 
    context.push("reverse_bagof_Declaration_1_0");
    Fail23603:
    { 
      TermReference i_4867 = new TermReference();
      TermReference j_4867 = new TermReference();
      if(j_4867.value == null)
        j_4867.value = term;
      else
        if(j_4867.value != term && !j_4867.value.match(term))
          break Fail23603;
      if(i_4867.value == null)
        i_4867.value = term;
      else
        if(i_4867.value != term && !i_4867.value.match(term))
          break Fail23603;
      Success12634:
      { 
        Fail23604:
        { 
          IStrategoTerm o_4867 = null;
          o_4867 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_4867, trans.const4570, j_4867.value);
          if(term == null)
            break Fail23604;
          if(true)
            break Success12634;
        }
        term = trans.constNil4;
      }
      lifted7045 lifted70450 = new lifted7045();
      lifted70450.i_4867 = i_4867;
      lifted70450.j_4867 = j_4867;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted70450, l_4867);
      if(term == null)
        break Fail23603;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}