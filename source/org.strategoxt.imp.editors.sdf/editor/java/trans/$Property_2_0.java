package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Property_2_0 extends Strategy 
{ 
  public static $Property_2_0 instance = new $Property_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_92076, Strategy b_92076)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Property_2_0");
    Fail76101:
    { 
      IStrategoTerm h_92265 = null;
      IStrategoTerm f_92265 = null;
      IStrategoTerm g_92265 = null;
      IStrategoTerm i_92265 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail76101;
      f_92265 = term.getSubterm(0);
      g_92265 = term.getSubterm(1);
      IStrategoList annos2359 = term.getAnnotations();
      h_92265 = annos2359;
      term = a_92076.invoke(context, f_92265);
      if(term == null)
        break Fail76101;
      i_92265 = term;
      term = b_92076.invoke(context, g_92265);
      if(term == null)
        break Fail76101;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consProperty_2, new IStrategoTerm[]{i_92265, term}), checkListAnnos(termFactory, h_92265));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}