package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigchain_$Current$File_0_0 extends Strategy 
{ 
  public static bigchain_$Current$File_0_0 instance = new bigchain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_CurrentFile_0_0");
    Fail87797:
    { 
      IStrategoTerm q_17583 = null;
      IStrategoTerm s_17583 = null;
      s_17583 = term;
      Success47306:
      { 
        Fail87798:
        { 
          IStrategoTerm t_17583 = null;
          IStrategoTerm v_17583 = null;
          IStrategoTerm w_17583 = null;
          v_17583 = term;
          t_17583 = trans.const17872;
          w_17583 = v_17583;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_17583, t_17583, trans.constCons8528);
          if(term == null)
            break Fail87798;
          if(true)
            break Success47306;
        }
        term = trans.constNil14;
      }
      q_17583 = term;
      term = s_17583;
      term = termFactory.makeTuple(q_17583, term);
      term = foldl_1_0.instance.invoke(context, term, lifted24781.instance);
      if(term == null)
        break Fail87797;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}