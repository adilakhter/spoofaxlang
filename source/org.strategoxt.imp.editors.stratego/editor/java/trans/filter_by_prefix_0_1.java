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

@SuppressWarnings("all") public class filter_by_prefix_0_1 extends Strategy 
{ 
  public static filter_by_prefix_0_1 instance = new filter_by_prefix_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_4256)
  { 
    TermReference f_4256 = new TermReference(ref_f_4256);
    context.push("filter_by_prefix_0_1");
    Fail21746:
    { 
      lifted6656 lifted66560 = new lifted6656();
      lifted66560.f_4256 = f_4256;
      term = filter_1_0.instance.invoke(context, term, lifted66560);
      if(term == null)
        break Fail21746;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}