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

@SuppressWarnings("all") public class bigchain_$Source$Dir_0_0 extends Strategy 
{ 
  public static bigchain_$Source$Dir_0_0 instance = new bigchain_$Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_SourceDir_0_0");
    Fail23466:
    { 
      IStrategoTerm p_4843 = null;
      IStrategoTerm r_4843 = null;
      r_4843 = term;
      Success12596:
      { 
        Fail23467:
        { 
          IStrategoTerm s_4843 = null;
          IStrategoTerm u_4843 = null;
          IStrategoTerm v_4843 = null;
          u_4843 = term;
          s_4843 = trans.const4552;
          v_4843 = u_4843;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, v_4843, s_4843, trans.constCons2047);
          if(term == null)
            break Fail23467;
          if(true)
            break Success12596;
        }
        term = trans.constNil4;
      }
      p_4843 = term;
      term = r_4843;
      term = termFactory.makeTuple(p_4843, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6996.instance);
      if(term == null)
        break Fail23466;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}