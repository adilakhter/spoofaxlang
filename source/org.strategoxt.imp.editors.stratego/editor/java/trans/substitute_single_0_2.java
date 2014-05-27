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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_4727, IStrategoTerm ref_z_4727)
  { 
    TermReference y_4727 = new TermReference(ref_y_4727);
    TermReference z_4727 = new TermReference(ref_z_4727);
    context.push("substitute_single_0_2");
    Fail22795:
    { 
      IStrategoTerm a_4728 = null;
      a_4728 = term;
      term = a_4728;
      lifted6737 lifted67370 = new lifted6737();
      lifted67370.y_4727 = y_4727;
      lifted67370.z_4727 = z_4727;
      term = topdown_1_0.instance.invoke(context, term, lifted67370);
      if(term == null)
        break Fail22795;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}