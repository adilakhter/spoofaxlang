package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Configuration_1_0 extends Strategy 
{ 
  public static $Configuration_1_0 instance = new $Configuration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Configuration_1_0");
    Fail87754:
    { 
      IStrategoTerm d_17677 = null;
      IStrategoTerm c_17677 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consConfiguration_1 != ((IStrategoAppl)term).getConstructor())
        break Fail87754;
      c_17677 = term.getSubterm(0);
      IStrategoList annos2690 = term.getAnnotations();
      d_17677 = annos2690;
      term = s_17576.invoke(context, c_17677);
      if(term == null)
        break Fail87754;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consConfiguration_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_17677));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}