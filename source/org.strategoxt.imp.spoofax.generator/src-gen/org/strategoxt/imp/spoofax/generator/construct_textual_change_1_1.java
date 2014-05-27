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

@SuppressWarnings("all") public class construct_textual_change_1_1 extends Strategy 
{ 
  public static construct_textual_change_1_1 instance = new construct_textual_change_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4541, IStrategoTerm ref_o_4541)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_4541 = new TermReference(ref_o_4541);
    context.push("construct_textual_change_1_1");
    Fail25841:
    { 
      IStrategoTerm term10275 = term;
      Success10216:
      { 
        Fail25842:
        { 
          IStrategoTerm d_4269 = null;
          IStrategoTerm e_4269 = null;
          IStrategoTerm f_4269 = null;
          IStrategoTerm g_4269 = null;
          IStrategoTerm h_4269 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail25842;
          d_4269 = term.getSubterm(0);
          e_4269 = term.getSubterm(1);
          Success10217:
          { 
            Fail25843:
            { 
              IStrategoTerm i_4269 = null;
              i_4269 = term;
              term = support_sublist_1_0.instance.invoke(context, e_4269, lifted9267.instance);
              if(term == null)
                break Fail25843;
              term = i_4269;
              { 
                term = e_4269;
                if(true)
                  break Success10217;
              }
            }
            IStrategoTerm d_4685 = null;
            IStrategoTerm g_4685 = null;
            TermReference e_4685 = new TermReference();
            IStrategoTerm f_4685 = null;
            g_4685 = e_4269;
            d_4685 = d_4269;
            term = g_4685;
            if(e_4685.value == null)
              e_4685.value = term;
            else
              if(e_4685.value != term && !e_4685.value.match(term))
                break Fail25842;
            term = termFactory.makeAppl(SpoofaxGenerator._consSome_1, new IStrategoTerm[]{d_4685});
            lifted9268 lifted92680 = new lifted9268();
            lifted92680.e_4685 = e_4685;
            term = SRTS_all.instance.invoke(context, term, lifted92680);
            if(term == null)
              break Fail25842;
            if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSome_1 != ((IStrategoAppl)term).getConstructor())
              break Fail25842;
            f_4685 = term.getSubterm(0);
            term = f_4685;
          }
          term = termFactory.makeTuple(d_4269, e_4269);
          lifted9269 lifted92690 = new lifted9269();
          lifted92690.n_4541 = n_4541;
          lifted92690.o_4541 = o_4541;
          term = construct_text_by_compare_1_1.instance.invoke(context, term, lifted92690, o_4541.value);
          if(term == null)
            break Fail25842;
          term = termFactory.makeAppl(SpoofaxGenerator._consREPLACEMENT_2, new IStrategoTerm[]{d_4269, term});
          lifted9270 lifted92700 = new lifted9270();
          lifted92700.n_4541 = n_4541;
          lifted92700.o_4541 = o_4541;
          term = ast_change_to_text_change_1_1.instance.invoke(context, term, lifted92700, o_4541.value);
          if(term == null)
            break Fail25842;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail25842;
          IStrategoTerm arg6238 = term.getSubterm(0);
          if(arg6238.getTermType() != IStrategoTerm.TUPLE || arg6238.getSubtermCount() != 2)
            break Fail25842;
          f_4269 = arg6238.getSubterm(0);
          g_4269 = arg6238.getSubterm(1);
          h_4269 = term.getSubterm(1);
          term = termFactory.makeTuple(f_4269, g_4269, h_4269);
          if(true)
            break Success10216;
        }
        term = term10275;
        IStrategoTerm term10279 = term;
        Success10218:
        { 
          Fail25844:
          { 
            IStrategoTerm x_4268 = null;
            IStrategoTerm y_4268 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail25844;
            x_4268 = term.getSubterm(0);
            y_4268 = term.getSubterm(1);
            term = termFactory.makeTuple(x_4268, y_4268);
            term = eq_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25844;
            term = generator.const7165;
            if(true)
              break Success10218;
          }
          term = term10279;
          lifted9271 lifted92710 = new lifted9271();
          lifted92710.n_4541 = n_4541;
          lifted92710.o_4541 = o_4541;
          term = map_1_0.instance.invoke(context, term, lifted92710);
          if(term == null)
            break Fail25841;
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