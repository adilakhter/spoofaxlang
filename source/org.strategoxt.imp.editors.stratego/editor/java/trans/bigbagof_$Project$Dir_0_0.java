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

@SuppressWarnings("all") public class bigbagof_$Project$Dir_0_0 extends Strategy 
{ 
  public static bigbagof_$Project$Dir_0_0 instance = new bigbagof_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_ProjectDir_0_0");
    Fail21916:
    { 
      TermReference a_4278 = new TermReference();
      if(a_4278.value == null)
        a_4278.value = term;
      else
        if(a_4278.value != term && !a_4278.value.match(term))
          break Fail21916;
      Success11868:
      { 
        Fail21917:
        { 
          IStrategoTerm d_4278 = null;
          IStrategoTerm f_4278 = null;
          IStrategoTerm g_4278 = null;
          f_4278 = term;
          d_4278 = trans.const4265;
          g_4278 = f_4278;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4278, d_4278, trans.constCons1966);
          if(term == null)
            break Fail21917;
          if(true)
            break Success11868;
        }
        term = trans.constNil3;
      }
      lifted6700 lifted67000 = new lifted6700();
      lifted67000.a_4278 = a_4278;
      term = filter_1_0.instance.invoke(context, term, lifted67000);
      if(term == null)
        break Fail21916;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}