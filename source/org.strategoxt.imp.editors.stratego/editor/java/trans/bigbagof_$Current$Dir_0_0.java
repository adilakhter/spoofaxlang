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

@SuppressWarnings("all") public class bigbagof_$Current$Dir_0_0 extends Strategy 
{ 
  public static bigbagof_$Current$Dir_0_0 instance = new bigbagof_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CurrentDir_0_0");
    Fail22098:
    { 
      TermReference t_4308 = new TermReference();
      if(t_4308.value == null)
        t_4308.value = term;
      else
        if(t_4308.value != term && !t_4308.value.match(term))
          break Fail22098;
      Success11917:
      { 
        Fail22099:
        { 
          IStrategoTerm w_4308 = null;
          IStrategoTerm y_4308 = null;
          IStrategoTerm z_4308 = null;
          y_4308 = term;
          w_4308 = trans.const4346;
          z_4308 = y_4308;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, z_4308, w_4308, trans.constCons1966);
          if(term == null)
            break Fail22099;
          if(true)
            break Success11917;
        }
        term = trans.constNil3;
      }
      lifted6763 lifted67630 = new lifted6763();
      lifted67630.t_4308 = t_4308;
      term = filter_1_0.instance.invoke(context, term, lifted67630);
      if(term == null)
        break Fail22098;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}