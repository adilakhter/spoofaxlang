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

@SuppressWarnings("all") public class get_dependend_renamings_0_0 extends Strategy 
{ 
  public static get_dependend_renamings_0_0 instance = new get_dependend_renamings_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_dependend_renamings_0_0");
    Fail21388:
    { 
      IStrategoTerm x_4189 = null;
      TermReference y_4189 = new TermReference();
      TermReference z_4189 = new TermReference();
      TermReference a_4190 = new TermReference();
      IStrategoTerm b_4190 = null;
      IStrategoTerm c_4190 = null;
      IStrategoTerm d_4190 = null;
      IStrategoTerm e_4190 = null;
      d_4190 = term;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21388;
      x_4189 = term.getSubterm(0);
      if(a_4190.value == null)
        a_4190.value = term.getSubterm(1);
      else
        if(a_4190.value != term.getSubterm(1) && !a_4190.value.match(term.getSubterm(1)))
          break Fail21388;
      term = x_4189;
      IStrategoList annos677 = term.getAnnotations();
      if(annos677.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos677).isEmpty())
        break Fail21388;
      if(z_4189.value == null)
        z_4189.value = ((IStrategoList)annos677).head();
      else
        if(z_4189.value != ((IStrategoList)annos677).head() && !z_4189.value.match(((IStrategoList)annos677).head()))
          break Fail21388;
      IStrategoTerm arg7666 = ((IStrategoList)annos677).tail();
      if(arg7666.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7666).isEmpty())
        break Fail21388;
      Success11475:
      { 
        Fail21389:
        { 
          IStrategoTerm f_4190 = null;
          f_4190 = term;
          if(z_4189.value == null)
            break Fail21389;
          term = $Declaration_0_0.instance.invoke(context, z_4189.value);
          if(term == null)
            break Fail21389;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
            break Fail21389;
          if(y_4189.value == null)
            y_4189.value = term.getSubterm(0);
          else
            if(y_4189.value != term.getSubterm(0) && !y_4189.value.match(term.getSubterm(0)))
              break Fail21389;
          term = f_4190;
          { 
            IStrategoTerm h_4192 = null;
            IStrategoTerm i_4192 = null;
            term = prefixes_dynrules_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21388;
            lifted6524 lifted65240 = new lifted6524();
            lifted65240.y_4189 = y_4189;
            lifted65240.z_4189 = z_4189;
            term = map_1_0.instance.invoke(context, term, lifted65240);
            if(term == null)
              break Fail21388;
            b_4190 = term;
            term = prefixes_dynrules_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21388;
            lifted6525 lifted65250 = new lifted6525();
            lifted65250.a_4190 = a_4190;
            lifted65250.z_4189 = z_4189;
            term = map_1_0.instance.invoke(context, term, lifted65250);
            if(term == null)
              break Fail21388;
            c_4190 = term;
            i_4192 = term;
            term = termFactory.makeTuple(b_4190, c_4190);
            term = zip_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21388;
            h_4192 = term;
            term = i_4192;
            if(y_4189.value == null || (z_4189.value == null || a_4190.value == null))
              break Fail21388;
            IStrategoList list183;
            list183 = checkListTail(h_4192);
            if(list183 == null)
              break Fail21388;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(termFactory.annotateTerm(y_4189.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(z_4189.value, (IStrategoList)trans.constNil3))), a_4190.value), list183);
            e_4190 = term;
            if(true)
              break Success11475;
          }
        }
        term = (IStrategoTerm)termFactory.makeListCons(d_4190, (IStrategoList)trans.constNil3);
        e_4190 = term;
      }
      term = e_4190;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}