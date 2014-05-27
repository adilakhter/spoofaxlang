package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $C$O$M$P$L$E$T$I$O$N_1_0 extends Strategy 
{ 
  public static $C$O$M$P$L$E$T$I$O$N_1_0 instance = new $C$O$M$P$L$E$T$I$O$N_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4273)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("COMPLETION_1_0");
    Fail21876:
    { 
      IStrategoTerm c_4499 = null;
      IStrategoTerm b_4499 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
        break Fail21876;
      b_4499 = term.getSubterm(0);
      IStrategoList annos688 = term.getAnnotations();
      c_4499 = annos688;
      term = u_4273.invoke(context, b_4499);
      if(term == null)
        break Fail21876;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consCOMPLETION_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_4499));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}