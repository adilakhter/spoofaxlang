package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $C$O$M$P$L$E$T$I$O$N_1_0 extends Strategy 
{ 
  public static $C$O$M$P$L$E$T$I$O$N_1_0 instance = new $C$O$M$P$L$E$T$I$O$N_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_92075)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("COMPLETION_1_0");
    Fail76097:
    { 
      IStrategoTerm v_92264 = null;
      IStrategoTerm u_92264 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
        break Fail76097;
      u_92264 = term.getSubterm(0);
      IStrategoList annos2356 = term.getAnnotations();
      v_92264 = annos2356;
      term = w_92075.invoke(context, u_92264);
      if(term == null)
        break Fail76097;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consCOMPLETION_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_92264));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}