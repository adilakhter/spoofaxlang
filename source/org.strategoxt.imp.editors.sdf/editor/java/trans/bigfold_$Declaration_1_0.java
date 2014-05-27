package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigfold_$Declaration_1_0 extends Strategy 
{ 
  public static bigfold_$Declaration_1_0 instance = new bigfold_$Declaration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_92103)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_Declaration_1_0");
    Fail76277:
    { 
      IStrategoTerm m_92103 = null;
      IStrategoTerm q_92103 = null;
      IStrategoTerm s_92103 = null;
      m_92103 = term;
      s_92103 = term;
      Success41848:
      { 
        Fail76278:
        { 
          IStrategoTerm u_92103 = null;
          u_92103 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, u_92103, trans.const15522, m_92103);
          if(term == null)
            break Fail76278;
          if(true)
            break Success41848;
        }
        term = trans.constNil11;
      }
      q_92103 = term;
      term = s_92103;
      term = termFactory.makeTuple(q_92103, term);
      term = p_92103.invoke(context, term, lifted21641.instance);
      if(term == null)
        break Fail76277;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}