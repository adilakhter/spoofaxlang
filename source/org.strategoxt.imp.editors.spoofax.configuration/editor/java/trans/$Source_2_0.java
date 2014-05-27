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

@SuppressWarnings("all") public class $Source_2_0 extends Strategy 
{ 
  public static $Source_2_0 instance = new $Source_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_17576, Strategy m_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Source_2_0");
    Fail87748:
    { 
      IStrategoTerm k_17676 = null;
      IStrategoTerm i_17676 = null;
      IStrategoTerm j_17676 = null;
      IStrategoTerm l_17676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSource_2 != ((IStrategoAppl)term).getConstructor())
        break Fail87748;
      i_17676 = term.getSubterm(0);
      j_17676 = term.getSubterm(1);
      IStrategoList annos2684 = term.getAnnotations();
      k_17676 = annos2684;
      term = l_17576.invoke(context, i_17676);
      if(term == null)
        break Fail87748;
      l_17676 = term;
      term = m_17576.invoke(context, j_17676);
      if(term == null)
        break Fail87748;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consSource_2, new IStrategoTerm[]{l_17676, term}), checkListAnnos(termFactory, k_17676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}