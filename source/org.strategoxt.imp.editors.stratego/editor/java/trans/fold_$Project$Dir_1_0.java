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

@SuppressWarnings("all") public class fold_$Project$Dir_1_0 extends Strategy 
{ 
  public static fold_$Project$Dir_1_0 instance = new fold_$Project$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4830)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_ProjectDir_1_0");
    Fail23386:
    { 
      IStrategoTerm n_4830 = null;
      IStrategoTerm p_4830 = null;
      p_4830 = term;
      Success12574:
      { 
        Fail23387:
        { 
          IStrategoTerm q_4830 = null;
          IStrategoTerm s_4830 = null;
          IStrategoTerm t_4830 = null;
          s_4830 = term;
          q_4830 = trans.const4475;
          t_4830 = s_4830;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_4830, q_4830, trans.constCons2047);
          if(term == null)
            break Fail23387;
          if(true)
            break Success12574;
        }
        term = trans.constNil4;
      }
      n_4830 = term;
      term = p_4830;
      term = termFactory.makeTuple(n_4830, term);
      term = m_4830.invoke(context, term, lifted6968.instance);
      if(term == null)
        break Fail23386;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}