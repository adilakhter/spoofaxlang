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

@SuppressWarnings("all") public class chain_$Current$File_0_0 extends Strategy 
{ 
  public static chain_$Current$File_0_0 instance = new chain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_CurrentFile_0_0");
    Fail76127:
    { 
      IStrategoTerm b_92079 = null;
      IStrategoTerm d_92079 = null;
      d_92079 = term;
      Success41809:
      { 
        Fail76128:
        { 
          IStrategoTerm e_92079 = null;
          IStrategoTerm g_92079 = null;
          IStrategoTerm h_92079 = null;
          g_92079 = term;
          e_92079 = trans.const15448;
          h_92079 = g_92079;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_92079, e_92079, trans.constCons7205);
          if(term == null)
            break Fail76128;
          if(true)
            break Success41809;
        }
        term = trans.constNil11;
      }
      b_92079 = term;
      term = d_92079;
      term = termFactory.makeTuple(b_92079, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21590.instance);
      if(term == null)
        break Fail76127;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}