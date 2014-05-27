package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class heuristic_child_sorts_0_0 extends Strategy 
{ 
  public static heuristic_child_sorts_0_0 instance = new heuristic_child_sorts_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("heuristic_child_sorts_0_0");
    Fail26285:
    { 
      TermReference s_4324 = new TermReference();
      IStrategoTerm term10635 = term;
      IStrategoConstructor cons351 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10549:
      { 
        if(cons351 == SpoofaxGenerator._consProdRule_2)
        { 
          Fail26286:
          { 
            IStrategoTerm t_4324 = null;
            IStrategoTerm arg6355 = term.getSubterm(0);
            if(arg6355.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6355).getConstructor())
              break Fail26286;
            if(s_4324.value == null)
              s_4324.value = arg6355.getSubterm(0);
            else
              if(s_4324.value != arg6355.getSubterm(0) && !s_4324.value.match(arg6355.getSubterm(0)))
                break Fail26286;
            IStrategoTerm arg6356 = term.getSubterm(1);
            if(arg6356.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6356).isEmpty())
              break Fail26286;
            IStrategoTerm arg6357 = ((IStrategoList)arg6356).head();
            if(arg6357.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consAppl_2 != ((IStrategoAppl)arg6357).getConstructor())
              break Fail26286;
            t_4324 = arg6357.getSubterm(1);
            IStrategoTerm arg6359 = ((IStrategoList)arg6356).tail();
            if(arg6359.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6359).isEmpty())
              break Fail26286;
            term = map_1_0.instance.invoke(context, t_4324, lifted9443.instance);
            if(term == null)
              break Fail26286;
            lifted9444 lifted94440 = new lifted9444();
            lifted94440.s_4324 = s_4324;
            term = filter_1_0.instance.invoke(context, term, lifted94440);
            if(term == null)
              break Fail26286;
            if(true)
              break Success10549;
          }
          term = term10635;
        }
        Success10550:
        { 
          if(cons351 == SpoofaxGenerator._consProdRule_2)
          { 
            Fail26287:
            { 
              IStrategoTerm v_4324 = null;
              IStrategoTerm arg6361 = term.getSubterm(0);
              if(arg6361.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6361).getConstructor())
                break Fail26287;
              if(s_4324.value == null)
                s_4324.value = arg6361.getSubterm(0);
              else
                if(s_4324.value != arg6361.getSubterm(0) && !s_4324.value.match(arg6361.getSubterm(0)))
                  break Fail26287;
              IStrategoTerm arg6362 = term.getSubterm(1);
              if(arg6362.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6362).isEmpty())
                break Fail26287;
              IStrategoTerm arg6363 = ((IStrategoList)arg6362).head();
              if(arg6363.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)arg6363).getConstructor())
                break Fail26287;
              IStrategoTerm arg6364 = arg6363.getSubterm(0);
              if(arg6364.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6364).getConstructor())
                break Fail26287;
              v_4324 = arg6364.getSubterm(0);
              IStrategoTerm arg6365 = ((IStrategoList)arg6362).tail();
              if(arg6365.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6365).isEmpty())
                break Fail26287;
              term = v_4324;
              IStrategoTerm term10638 = term;
              Success10551:
              { 
                Fail26288:
                { 
                  if(s_4324.value == null)
                    s_4324.value = term;
                  else
                    if(s_4324.value != term && !s_4324.value.match(term))
                      break Fail26288;
                  { 
                    if(true)
                      break Fail26287;
                    if(true)
                      break Success10551;
                  }
                }
                term = term10638;
              }
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constNil7);
              if(true)
                break Success10550;
            }
            term = term10635;
          }
          term = verify_2_0.instance.invoke(context, term, lifted9445.instance, lifted9448.instance);
          if(term == null)
            break Fail26285;
          term = generator.constNil7;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}