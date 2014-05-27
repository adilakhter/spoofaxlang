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

@SuppressWarnings("all") public class fold_$Is$No$Conflict_1_0 extends Strategy 
{ 
  public static fold_$Is$No$Conflict_1_0 instance = new fold_$Is$No$Conflict_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4895)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsNoConflict_1_0");
    Fail23775:
    { 
      IStrategoTerm m_4895 = null;
      IStrategoTerm q_4895 = null;
      IStrategoTerm s_4895 = null;
      m_4895 = term;
      s_4895 = term;
      Success12696:
      { 
        Fail23776:
        { 
          IStrategoTerm u_4895 = null;
          u_4895 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_4895, trans.const4637, m_4895);
          if(term == null)
            break Fail23776;
          if(true)
            break Success12696;
        }
        term = trans.constNil4;
      }
      q_4895 = term;
      term = s_4895;
      term = termFactory.makeTuple(q_4895, term);
      term = p_4895.invoke(context, term, lifted7104.instance);
      if(term == null)
        break Fail23775;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}