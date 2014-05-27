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

@SuppressWarnings("all") public class fold_$Current$Dir_1_0 extends Strategy 
{ 
  public static fold_$Current$Dir_1_0 instance = new fold_$Current$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4307)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CurrentDir_1_0");
    Fail22092:
    { 
      IStrategoTerm o_4307 = null;
      IStrategoTerm q_4307 = null;
      q_4307 = term;
      Success11914:
      { 
        Fail22093:
        { 
          IStrategoTerm r_4307 = null;
          IStrategoTerm t_4307 = null;
          IStrategoTerm u_4307 = null;
          t_4307 = term;
          r_4307 = trans.const4346;
          u_4307 = t_4307;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_4307, r_4307, trans.constCons1966);
          if(term == null)
            break Fail22093;
          if(true)
            break Success11914;
        }
        term = trans.constNil3;
      }
      o_4307 = term;
      term = q_4307;
      term = termFactory.makeTuple(o_4307, term);
      term = n_4307.invoke(context, term, lifted6760.instance);
      if(term == null)
        break Fail22092;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}