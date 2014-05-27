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

@SuppressWarnings("all") public class $Configuration_1_0 extends Strategy 
{ 
  public static $Configuration_1_0 instance = new $Configuration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Configuration_1_0");
    Fail22946:
    { 
      IStrategoTerm g_4733 = null;
      IStrategoTerm f_4733 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consConfiguration_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22946;
      f_4733 = term.getSubterm(0);
      IStrategoList annos711 = term.getAnnotations();
      g_4733 = annos711;
      term = v_4632.invoke(context, f_4733);
      if(term == null)
        break Fail22946;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consConfiguration_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_4733));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}