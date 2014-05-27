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
    Fail21331:
    { 
      IStrategoTerm y_4177 = null;
      IStrategoTerm z_4177 = null;
      IStrategoTerm b_4178 = null;
      IStrategoTerm d_4178 = null;
      IStrategoTerm e_4178 = null;
      z_4177 = term;
      term = import_cache_path_0_0.instance.invoke(context, z_4177);
      if(term == null)
        break Fail21331;
      d_4178 = term;
      b_4178 = trans.const4260;
      e_4178 = d_4178;
      term = string_replace_0_2.instance.invoke(context, e_4178, b_4178, trans.const4261);
      if(term == null)
        break Fail21331;
      y_4177 = term;
      term = termFactory.makeTuple(term, z_4177);
      term = is_newer_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21331;
      term = y_4177;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}