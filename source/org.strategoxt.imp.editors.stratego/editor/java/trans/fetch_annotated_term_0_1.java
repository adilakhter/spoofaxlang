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

@SuppressWarnings("all") public class fetch_annotated_term_0_1 extends Strategy 
{ 
  public static fetch_annotated_term_0_1 instance = new fetch_annotated_term_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_4716)
  { 
    TermReference c_4716 = new TermReference(ref_c_4716);
    context.push("fetch_annotated_term_0_1");
    Fail22713:
    { 
      IStrategoTerm d_4716 = null;
      d_4716 = term;
      term = d_4716;
      lifted6694 lifted66940 = new lifted6694();
      lifted66940.c_4716 = c_4716;
      term = fetch_by_origin_1_1.instance.invoke(context, term, lifted66940, c_4716.value);
      if(term == null)
        break Fail22713;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}