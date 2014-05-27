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

@SuppressWarnings("all") public class $S$T$R$Output$Mode_1_0 extends Strategy 
{ 
  public static $S$T$R$Output$Mode_1_0 instance = new $S$T$R$Output$Mode_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("STROutputMode_1_0");
    Fail22930:
    { 
      IStrategoTerm g_4732 = null;
      IStrategoTerm f_4732 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSTROutputMode_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22930;
      f_4732 = term.getSubterm(0);
      IStrategoList annos703 = term.getAnnotations();
      g_4732 = annos703;
      term = m_4632.invoke(context, f_4732);
      if(term == null)
        break Fail22930;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consSTROutputMode_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_4732));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}