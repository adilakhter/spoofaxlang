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

@SuppressWarnings("all") public class $N$O$C$O$N$T$E$X$T_1_0 extends Strategy 
{ 
  public static $N$O$C$O$N$T$E$X$T_1_0 instance = new $N$O$C$O$N$T$E$X$T_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4273)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NOCONTEXT_1_0");
    Fail21877:
    { 
      IStrategoTerm f_4499 = null;
      IStrategoTerm e_4499 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consNOCONTEXT_1 != ((IStrategoAppl)term).getConstructor())
        break Fail21877;
      e_4499 = term.getSubterm(0);
      IStrategoList annos689 = term.getAnnotations();
      f_4499 = annos689;
      term = v_4273.invoke(context, e_4499);
      if(term == null)
        break Fail21877;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consNOCONTEXT_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_4499));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}