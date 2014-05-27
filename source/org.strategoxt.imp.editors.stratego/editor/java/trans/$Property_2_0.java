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

@SuppressWarnings("all") public class $Property_2_0 extends Strategy 
{ 
  public static $Property_2_0 instance = new $Property_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4827, Strategy r_4827)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Property_2_0");
    Fail23356:
    { 
      IStrategoTerm g_5053 = null;
      IStrategoTerm e_5053 = null;
      IStrategoTerm f_5053 = null;
      IStrategoTerm h_5053 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23356;
      e_5053 = term.getSubterm(0);
      f_5053 = term.getSubterm(1);
      IStrategoList annos719 = term.getAnnotations();
      g_5053 = annos719;
      term = q_4827.invoke(context, e_5053);
      if(term == null)
        break Fail23356;
      h_5053 = term;
      term = r_4827.invoke(context, f_5053);
      if(term == null)
        break Fail23356;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consProperty_2, new IStrategoTerm[]{h_5053, term}), checkListAnnos(termFactory, g_5053));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}