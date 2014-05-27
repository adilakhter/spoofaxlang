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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_17576)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("STROutputMode_1_0");
    Fail87738:
    { 
      IStrategoTerm d_17676 = null;
      IStrategoTerm c_17676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSTROutputMode_1 != ((IStrategoAppl)term).getConstructor())
        break Fail87738;
      c_17676 = term.getSubterm(0);
      IStrategoList annos2682 = term.getAnnotations();
      d_17676 = annos2682;
      term = j_17576.invoke(context, c_17676);
      if(term == null)
        break Fail87738;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consSTROutputMode_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_17676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}