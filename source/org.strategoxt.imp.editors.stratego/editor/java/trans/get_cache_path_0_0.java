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

@SuppressWarnings("all") public class get_cache_path_0_0 extends Strategy 
{ 
  public static get_cache_path_0_0 instance = new get_cache_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_cache_path_0_0");
    Fail22807:
    { 
      IStrategoTerm q_4731 = null;
      IStrategoTerm r_4731 = null;
      IStrategoTerm t_4731 = null;
      IStrategoTerm v_4731 = null;
      IStrategoTerm w_4731 = null;
      r_4731 = term;
      term = import_cache_path_0_0.instance.invoke(context, r_4731);
      if(term == null)
        break Fail22807;
      v_4731 = term;
      t_4731 = trans.const4470;
      w_4731 = v_4731;
      term = string_replace_0_2.instance.invoke(context, w_4731, t_4731, trans.const4471);
      if(term == null)
        break Fail22807;
      q_4731 = term;
      term = termFactory.makeTuple(term, r_4731);
      term = is_newer_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22807;
      term = q_4731;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}