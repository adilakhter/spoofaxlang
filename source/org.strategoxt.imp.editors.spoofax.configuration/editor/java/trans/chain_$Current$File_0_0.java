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
    Fail87799:
    { 
      IStrategoTerm b_17584 = null;
      IStrategoTerm d_17584 = null;
      d_17584 = term;
      Success47307:
      { 
        Fail87800:
        { 
          IStrategoTerm e_17584 = null;
          IStrategoTerm g_17584 = null;
          IStrategoTerm h_17584 = null;
          g_17584 = term;
          e_17584 = trans.const17872;
          h_17584 = g_17584;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_17584, e_17584, trans.constCons8528);
          if(term == null)
            break Fail87800;
          if(true)
            break Success47307;
        }
        term = trans.constNil14;
      }
      b_17584 = term;
      term = d_17584;
      term = termFactory.makeTuple(b_17584, term);
      term = foldl_1_0.instance.invoke(context, term, lifted24782.instance);
      if(term == null)
        break Fail87799;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}