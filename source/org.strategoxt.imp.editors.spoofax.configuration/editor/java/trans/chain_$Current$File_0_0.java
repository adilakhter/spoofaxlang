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

@SuppressWarnings("all") public class chain_$Current$File_0_0 extends Strategy 
{ 
  public static chain_$Current$File_0_0 instance = new chain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_CurrentFile_0_0");
    Fail22991:
    { 
      IStrategoTerm e_4640 = null;
      IStrategoTerm g_4640 = null;
      g_4640 = term;
      Success12220:
      { 
        Fail22992:
        { 
          IStrategoTerm h_4640 = null;
          IStrategoTerm j_4640 = null;
          IStrategoTerm k_4640 = null;
          j_4640 = term;
          h_4640 = trans.const4485;
          k_4640 = j_4640;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4640, h_4640, trans.constCons2047);
          if(term == null)
            break Fail22992;
          if(true)
            break Success12220;
        }
        term = trans.constNil4;
      }
      e_4640 = term;
      term = g_4640;
      term = termFactory.makeTuple(e_4640, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6897.instance);
      if(term == null)
        break Fail22991;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}