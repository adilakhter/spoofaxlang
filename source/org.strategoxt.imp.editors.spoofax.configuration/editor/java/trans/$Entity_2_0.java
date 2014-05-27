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

@SuppressWarnings("all") public class $Entity_2_0 extends Strategy 
{ 
  public static $Entity_2_0 instance = new $Entity_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_17576, Strategy f_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Entity_2_0");
    Fail87731:
    { 
      IStrategoTerm r_17675 = null;
      IStrategoTerm p_17675 = null;
      IStrategoTerm q_17675 = null;
      IStrategoTerm s_17675 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consEntity_2 != ((IStrategoAppl)term).getConstructor())
        break Fail87731;
      p_17675 = term.getSubterm(0);
      q_17675 = term.getSubterm(1);
      IStrategoList annos2679 = term.getAnnotations();
      r_17675 = annos2679;
      term = e_17576.invoke(context, p_17675);
      if(term == null)
        break Fail87731;
      s_17675 = term;
      term = f_17576.invoke(context, q_17675);
      if(term == null)
        break Fail87731;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consEntity_2, new IStrategoTerm[]{s_17675, term}), checkListAnnos(termFactory, r_17675));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}