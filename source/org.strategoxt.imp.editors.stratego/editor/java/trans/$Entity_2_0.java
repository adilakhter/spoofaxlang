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

@SuppressWarnings("all") public class $Entity_2_0 extends Strategy 
{ 
  public static $Entity_2_0 instance = new $Entity_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4827, Strategy p_4827)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Entity_2_0");
    Fail23355:
    { 
      IStrategoTerm b_5053 = null;
      IStrategoTerm z_5052 = null;
      IStrategoTerm a_5053 = null;
      IStrategoTerm c_5053 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consEntity_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23355;
      z_5052 = term.getSubterm(0);
      a_5053 = term.getSubterm(1);
      IStrategoList annos718 = term.getAnnotations();
      b_5053 = annos718;
      term = o_4827.invoke(context, z_5052);
      if(term == null)
        break Fail23355;
      c_5053 = term;
      term = p_4827.invoke(context, a_5053);
      if(term == null)
        break Fail23355;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consEntity_2, new IStrategoTerm[]{c_5053, term}), checkListAnnos(termFactory, b_5053));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}