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

@SuppressWarnings("all") public class get_source_files_0_2 extends Strategy 
{ 
  public static get_source_files_0_2 instance = new get_source_files_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_4733, IStrategoTerm ref_w_4733)
  { 
    TermReference v_4733 = new TermReference(ref_v_4733);
    TermReference w_4733 = new TermReference(ref_w_4733);
    context.push("get_source_files_0_2");
    Fail22816:
    { 
      IStrategoTerm x_4733 = null;
      x_4733 = term;
      term = x_4733;
      lifted6768 lifted67680 = new lifted6768();
      lifted6767 lifted67670 = new lifted6767();
      lifted67680.w_4733 = w_4733;
      lifted67670.v_4733 = v_4733;
      term = get_source_files_2_0.instance.invoke(context, term, lifted67670, lifted67680);
      if(term == null)
        break Fail22816;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}