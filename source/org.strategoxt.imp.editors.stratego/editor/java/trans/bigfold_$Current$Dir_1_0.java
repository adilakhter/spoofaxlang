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

@SuppressWarnings("all") public class bigfold_$Current$Dir_1_0 extends Strategy 
{ 
  public static bigfold_$Current$Dir_1_0 instance = new bigfold_$Current$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4860)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CurrentDir_1_0");
    Fail23566:
    { 
      IStrategoTerm u_4860 = null;
      IStrategoTerm w_4860 = null;
      w_4860 = term;
      Success12622:
      { 
        Fail23567:
        { 
          IStrategoTerm x_4860 = null;
          IStrategoTerm z_4860 = null;
          IStrategoTerm a_4861 = null;
          z_4860 = term;
          x_4860 = trans.const4556;
          a_4861 = z_4860;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, a_4861, x_4860, trans.constCons2047);
          if(term == null)
            break Fail23567;
          if(true)
            break Success12622;
        }
        term = trans.constNil4;
      }
      u_4860 = term;
      term = w_4860;
      term = termFactory.makeTuple(u_4860, term);
      term = t_4860.invoke(context, term, lifted7030.instance);
      if(term == null)
        break Fail23566;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}