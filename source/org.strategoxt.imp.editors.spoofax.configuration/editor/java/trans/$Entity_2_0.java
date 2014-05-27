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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4632, Strategy i_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Entity_2_0");
    Fail22923:
    { 
      IStrategoTerm u_4731 = null;
      IStrategoTerm s_4731 = null;
      IStrategoTerm t_4731 = null;
      IStrategoTerm v_4731 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consEntity_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22923;
      s_4731 = term.getSubterm(0);
      t_4731 = term.getSubterm(1);
      IStrategoList annos700 = term.getAnnotations();
      u_4731 = annos700;
      term = h_4632.invoke(context, s_4731);
      if(term == null)
        break Fail22923;
      v_4731 = term;
      term = i_4632.invoke(context, t_4731);
      if(term == null)
        break Fail22923;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consEntity_2, new IStrategoTerm[]{v_4731, term}), checkListAnnos(termFactory, u_4731));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}