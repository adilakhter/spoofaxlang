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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_4855)
  { 
    context.push("break_to_label_NoAnalysis_0_1");
    Fail23537:
    { 
      IStrategoTerm s_4855 = null;
      s_4855 = term;
      term = dr_break_0_2.instance.invoke(context, s_4855, trans.const4559, q_4855);
      if(term == null)
        break Fail23537;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}