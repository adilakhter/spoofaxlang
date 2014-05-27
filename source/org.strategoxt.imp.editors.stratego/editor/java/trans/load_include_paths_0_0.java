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

@SuppressWarnings("all") public class load_include_paths_0_0 extends Strategy 
{ 
  public static load_include_paths_0_0 instance = new load_include_paths_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("load_include_paths_0_0");
    Fail23120:
    { 
      IStrategoTerm t_4784 = null;
      term = load_include_properties_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23120;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted6861.instance);
      if(term == null)
        break Fail23120;
      t_4784 = term;
      term = string_tokenize_0_1.instance.invoke(context, t_4784, trans.constCons2094);
      if(term == null)
        break Fail23120;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}