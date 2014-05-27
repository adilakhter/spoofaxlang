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

@SuppressWarnings("all") public class chain_$Current$File_0_0 extends Strategy 
{ 
  public static chain_$Current$File_0_0 instance = new chain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_CurrentFile_0_0");
    Fail23416:
    { 
      IStrategoTerm q_4835 = null;
      IStrategoTerm s_4835 = null;
      s_4835 = term;
      Success12583:
      { 
        Fail23417:
        { 
          IStrategoTerm t_4835 = null;
          IStrategoTerm v_4835 = null;
          IStrategoTerm w_4835 = null;
          v_4835 = term;
          t_4835 = trans.const4473;
          w_4835 = v_4835;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4835, t_4835, trans.constCons2047);
          if(term == null)
            break Fail23417;
          if(true)
            break Success12583;
        }
        term = trans.constNil4;
      }
      q_4835 = term;
      term = s_4835;
      term = termFactory.makeTuple(q_4835, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6979.instance);
      if(term == null)
        break Fail23416;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}