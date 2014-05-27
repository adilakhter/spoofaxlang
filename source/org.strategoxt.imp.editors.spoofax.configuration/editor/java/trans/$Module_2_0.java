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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4632, Strategy g_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail22922:
    { 
      IStrategoTerm p_4731 = null;
      IStrategoTerm n_4731 = null;
      IStrategoTerm o_4731 = null;
      IStrategoTerm q_4731 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22922;
      n_4731 = term.getSubterm(0);
      o_4731 = term.getSubterm(1);
      IStrategoList annos699 = term.getAnnotations();
      p_4731 = annos699;
      term = f_4632.invoke(context, n_4731);
      if(term == null)
        break Fail22922;
      q_4731 = term;
      term = g_4632.invoke(context, o_4731);
      if(term == null)
        break Fail22922;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consModule_2, new IStrategoTerm[]{q_4731, term}), checkListAnnos(termFactory, p_4731));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}