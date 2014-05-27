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

@SuppressWarnings("all") public class bigchain_$Project$Dir_0_0 extends Strategy 
{ 
  public static bigchain_$Project$Dir_0_0 instance = new bigchain_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_ProjectDir_0_0");
    Fail21912:
    { 
      IStrategoTerm g_4277 = null;
      IStrategoTerm i_4277 = null;
      i_4277 = term;
      Success11866:
      { 
        Fail21913:
        { 
          IStrategoTerm j_4277 = null;
          IStrategoTerm l_4277 = null;
          IStrategoTerm m_4277 = null;
          l_4277 = term;
          j_4277 = trans.const4265;
          m_4277 = l_4277;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_4277, j_4277, trans.constCons1966);
          if(term == null)
            break Fail21913;
          if(true)
            break Success11866;
        }
        term = trans.constNil3;
      }
      g_4277 = term;
      term = i_4277;
      term = termFactory.makeTuple(g_4277, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6698.instance);
      if(term == null)
        break Fail21912;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}