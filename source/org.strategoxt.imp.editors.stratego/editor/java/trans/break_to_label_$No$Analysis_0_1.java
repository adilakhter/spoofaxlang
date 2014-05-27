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

@SuppressWarnings("all") public class break_to_label_$No$Analysis_0_1 extends Strategy 
{ 
  public static break_to_label_$No$Analysis_0_1 instance = new break_to_label_$No$Analysis_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_4301)
  { 
    context.push("break_to_label_NoAnalysis_0_1");
    Fail22061:
    { 
      IStrategoTerm a_4302 = null;
      a_4302 = term;
      term = dr_break_0_2.instance.invoke(context, a_4302, trans.const4349, y_4301);
      if(term == null)
        break Fail22061;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}