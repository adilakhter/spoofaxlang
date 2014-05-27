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

@SuppressWarnings("all") public class reverse_bagof_$Source$Dir_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Source$Dir_1_0 instance = new reverse_bagof_$Source$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4291)
  { 
    context.push("reverse_bagof_SourceDir_1_0");
    Fail21997:
    { 
      TermReference j_4291 = new TermReference();
      if(j_4291.value == null)
        j_4291.value = term;
      else
        if(j_4291.value != term && !j_4291.value.match(term))
          break Fail21997;
      Success11890:
      { 
        Fail21998:
        { 
          IStrategoTerm n_4291 = null;
          IStrategoTerm p_4291 = null;
          IStrategoTerm q_4291 = null;
          p_4291 = term;
          n_4291 = trans.const4342;
          q_4291 = p_4291;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_4291, n_4291, trans.constCons1966);
          if(term == null)
            break Fail21998;
          if(true)
            break Success11890;
        }
        term = trans.constNil3;
      }
      lifted6729 lifted67290 = new lifted6729();
      lifted67290.j_4291 = j_4291;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted67290, l_4291);
      if(term == null)
        break Fail21997;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}