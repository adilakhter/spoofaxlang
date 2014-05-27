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

@SuppressWarnings("all") public class $Property_2_0 extends Strategy 
{ 
  public static $Property_2_0 instance = new $Property_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_17576, Strategy h_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Property_2_0");
    Fail87732:
    { 
      IStrategoTerm w_17675 = null;
      IStrategoTerm u_17675 = null;
      IStrategoTerm v_17675 = null;
      IStrategoTerm x_17675 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail87732;
      u_17675 = term.getSubterm(0);
      v_17675 = term.getSubterm(1);
      IStrategoList annos2680 = term.getAnnotations();
      w_17675 = annos2680;
      term = g_17576.invoke(context, u_17675);
      if(term == null)
        break Fail87732;
      x_17675 = term;
      term = h_17576.invoke(context, v_17675);
      if(term == null)
        break Fail87732;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consProperty_2, new IStrategoTerm[]{x_17675, term}), checkListAnnos(termFactory, w_17675));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}