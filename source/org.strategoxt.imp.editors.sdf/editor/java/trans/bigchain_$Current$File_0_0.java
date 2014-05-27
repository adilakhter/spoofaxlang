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

@SuppressWarnings("all") public class bigchain_$Current$File_0_0 extends Strategy 
{ 
  public static bigchain_$Current$File_0_0 instance = new bigchain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_CurrentFile_0_0");
    Fail76125:
    { 
      IStrategoTerm q_92078 = null;
      IStrategoTerm s_92078 = null;
      s_92078 = term;
      Success41808:
      { 
        Fail76126:
        { 
          IStrategoTerm t_92078 = null;
          IStrategoTerm v_92078 = null;
          IStrategoTerm w_92078 = null;
          v_92078 = term;
          t_92078 = trans.const15448;
          w_92078 = v_92078;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_92078, t_92078, trans.constCons7205);
          if(term == null)
            break Fail76126;
          if(true)
            break Success41808;
        }
        term = trans.constNil11;
      }
      q_92078 = term;
      term = s_92078;
      term = termFactory.makeTuple(q_92078, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21589.instance);
      if(term == null)
        break Fail76125;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}