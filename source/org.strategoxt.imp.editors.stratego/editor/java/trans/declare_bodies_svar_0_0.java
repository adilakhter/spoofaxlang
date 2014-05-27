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

@SuppressWarnings("all") public class declare_bodies_svar_0_0 extends Strategy 
{ 
  public static declare_bodies_svar_0_0 instance = new declare_bodies_svar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_bodies_svar_0_0");
    Fail23210:
    { 
      TermReference f_4807 = new TermReference();
      IStrategoTerm g_4807 = null;
      IStrategoTerm h_4807 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail23210;
      IStrategoTerm arg8243 = term.getSubterm(0);
      if(arg8243.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg8243).getConstructor())
        break Fail23210;
      g_4807 = arg8243.getSubterm(0);
      IStrategoTerm arg8244 = term.getSubterm(1);
      if(arg8244.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8244).isEmpty())
        break Fail23210;
      IStrategoTerm arg8245 = term.getSubterm(2);
      if(arg8245.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8245).isEmpty())
        break Fail23210;
      IStrategoTerm term12536 = term;
      Success12433:
      { 
        Fail23211:
        { 
          term = declare_cookie_of_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23211;
          term = termFactory.annotateTerm(g_4807, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
          h_4807 = term;
          if(true)
            break Success12433;
        }
        term = term12536;
        term = signature_of_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail23210;
        if(f_4807.value == null)
          f_4807.value = term;
        else
          if(f_4807.value != term && !f_4807.value.match(term))
            break Fail23210;
        term = all_keys_$Declare$Cookie_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail23210;
        lifted6915 lifted69150 = new lifted6915();
        lifted69150.f_4807 = f_4807;
        term = fetch_elem_1_0.instance.invoke(context, term, lifted69150);
        if(term == null)
          break Fail23210;
        term = termFactory.annotateTerm(g_4807, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
        h_4807 = term;
      }
      term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consSVar_1, new IStrategoTerm[]{h_4807}), trans.constNil4, trans.constNil4});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}