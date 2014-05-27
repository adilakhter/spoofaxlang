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

@SuppressWarnings("all") public class get_source_asts_0_2 extends Strategy 
{ 
  public static get_source_asts_0_2 instance = new get_source_asts_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_4733, IStrategoTerm ref_f_4733)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_4733 = new TermReference(ref_e_4733);
    TermReference f_4733 = new TermReference(ref_f_4733);
    context.push("get_source_asts_0_2");
    Fail22813:
    { 
      IStrategoTerm g_4733 = null;
      IStrategoTerm h_4733 = null;
      IStrategoTerm i_4733 = null;
      g_4733 = term;
      term = g_4733;
      lifted6765 lifted67650 = new lifted6765();
      lifted6764 lifted67640 = new lifted6764();
      lifted67650.f_4733 = f_4733;
      lifted67640.e_4733 = e_4733;
      term = get_source_asts_2_0.instance.invoke(context, term, lifted67640, lifted67650);
      if(term == null)
        break Fail22813;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22813;
      h_4733 = term.getSubterm(0);
      i_4733 = term.getSubterm(1);
      term = termFactory.makeTuple(h_4733, i_4733);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}