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

@SuppressWarnings("all") public class $C$O$M$P$L$E$T$I$O$N_1_0 extends Strategy 
{ 
  public static $C$O$M$P$L$E$T$I$O$N_1_0 instance = new $C$O$M$P$L$E$T$I$O$N_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("COMPLETION_1_0");
    Fail22919:
    { 
      IStrategoTerm i_4731 = null;
      IStrategoTerm h_4731 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22919;
      h_4731 = term.getSubterm(0);
      IStrategoList annos697 = term.getAnnotations();
      i_4731 = annos697;
      term = d_4632.invoke(context, h_4731);
      if(term == null)
        break Fail22919;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consCOMPLETION_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_4731));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}