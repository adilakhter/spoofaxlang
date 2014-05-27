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

@SuppressWarnings("all") public class $N$O$C$O$N$T$E$X$T_1_0 extends Strategy 
{ 
  public static $N$O$C$O$N$T$E$X$T_1_0 instance = new $N$O$C$O$N$T$E$X$T_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NOCONTEXT_1_0");
    Fail22920:
    { 
      IStrategoTerm l_4731 = null;
      IStrategoTerm k_4731 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consNOCONTEXT_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22920;
      k_4731 = term.getSubterm(0);
      IStrategoList annos698 = term.getAnnotations();
      l_4731 = annos698;
      term = e_4632.invoke(context, k_4731);
      if(term == null)
        break Fail22920;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consNOCONTEXT_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_4731));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}