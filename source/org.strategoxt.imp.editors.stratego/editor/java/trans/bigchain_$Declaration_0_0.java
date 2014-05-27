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

@SuppressWarnings("all") public class bigchain_$Declaration_0_0 extends Strategy 
{ 
  public static bigchain_$Declaration_0_0 instance = new bigchain_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_Declaration_0_0");
    Fail22120:
    { 
      IStrategoTerm f_4312 = null;
      IStrategoTerm i_4312 = null;
      IStrategoTerm k_4312 = null;
      f_4312 = term;
      k_4312 = term;
      Success11922:
      { 
        Fail22121:
        { 
          IStrategoTerm m_4312 = null;
          m_4312 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_4312, trans.const4360, f_4312);
          if(term == null)
            break Fail22121;
          if(true)
            break Success11922;
        }
        term = trans.constNil3;
      }
      i_4312 = term;
      term = k_4312;
      term = termFactory.makeTuple(i_4312, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6770.instance);
      if(term == null)
        break Fail22120;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}