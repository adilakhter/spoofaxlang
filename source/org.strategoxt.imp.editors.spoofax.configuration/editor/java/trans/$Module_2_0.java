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

@SuppressWarnings("all") public class $Module_2_0 extends Strategy 
{ 
  public static $Module_2_0 instance = new $Module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_17576, Strategy d_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail87730:
    { 
      IStrategoTerm m_17675 = null;
      IStrategoTerm k_17675 = null;
      IStrategoTerm l_17675 = null;
      IStrategoTerm n_17675 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail87730;
      k_17675 = term.getSubterm(0);
      l_17675 = term.getSubterm(1);
      IStrategoList annos2678 = term.getAnnotations();
      m_17675 = annos2678;
      term = c_17576.invoke(context, k_17675);
      if(term == null)
        break Fail87730;
      n_17675 = term;
      term = d_17576.invoke(context, l_17675);
      if(term == null)
        break Fail87730;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consModule_2, new IStrategoTerm[]{n_17675, term}), checkListAnnos(termFactory, m_17675));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}