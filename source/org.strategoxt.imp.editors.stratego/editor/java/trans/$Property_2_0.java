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

@SuppressWarnings("all") public class $Property_2_0 extends Strategy 
{ 
  public static $Property_2_0 instance = new $Property_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4273, Strategy z_4273)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Property_2_0");
    Fail21880:
    { 
      IStrategoTerm o_4499 = null;
      IStrategoTerm m_4499 = null;
      IStrategoTerm n_4499 = null;
      IStrategoTerm p_4499 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21880;
      m_4499 = term.getSubterm(0);
      n_4499 = term.getSubterm(1);
      IStrategoList annos691 = term.getAnnotations();
      o_4499 = annos691;
      term = y_4273.invoke(context, m_4499);
      if(term == null)
        break Fail21880;
      p_4499 = term;
      term = z_4273.invoke(context, n_4499);
      if(term == null)
        break Fail21880;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consProperty_2, new IStrategoTerm[]{p_4499, term}), checkListAnnos(termFactory, o_4499));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}