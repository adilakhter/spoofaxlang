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

@SuppressWarnings("all") public class substitute_single_0_2 extends Strategy 
{ 
  public static substitute_single_0_2 instance = new substitute_single_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_4174, IStrategoTerm ref_h_4174)
  { 
    TermReference g_4174 = new TermReference(ref_g_4174);
    TermReference h_4174 = new TermReference(ref_h_4174);
    context.push("substitute_single_0_2");
    Fail21319:
    { 
      IStrategoTerm i_4174 = null;
      i_4174 = term;
      term = i_4174;
      lifted6466 lifted64660 = new lifted6466();
      lifted64660.g_4174 = g_4174;
      lifted64660.h_4174 = h_4174;
      term = topdown_1_0.instance.invoke(context, term, lifted64660);
      if(term == null)
        break Fail21319;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}