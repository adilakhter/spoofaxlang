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

@SuppressWarnings("all") public class fetch_by_origin_1_1 extends Strategy 
{ 
  public static fetch_by_origin_1_1 instance = new fetch_by_origin_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4162, IStrategoTerm ref_t_4162)
  { 
    TermReference t_4162 = new TermReference(ref_t_4162);
    context.push("fetch_by_origin_1_1");
    Fail21240:
    { 
      IStrategoTerm u_4162 = null;
      u_4162 = term;
      term = u_4162;
      lifted6426 lifted64260 = new lifted6426();
      lifted64260.y_4162 = y_4162;
      lifted64260.t_4162 = t_4162;
      term = collect_one_1_0.instance.invoke(context, term, lifted64260);
      if(term == null)
        break Fail21240;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}